package grammar.thread.method.PractiseDecrypt;

import java.util.*;

/**
 * 解密
 */
public class PractiseDecrypt {
    private static List<String> sc =new ArrayList<>();

    public static void main(String[] args) {
        String a =getRandomString(4);
        System.out.println("获取的随机字符串是："+a);
        getStringContainer();
        List<String> tmpContainer = new ArrayList<>();
//        System.out.println("容器中的字符串是：");
//        sc.stream()
//          .forEach(s-> System.out.println("["+s+"]"));

        Thread t1 = new Thread(){
            public void run(){
                for (String str:sc ) {
                    if(str.equals(a)){
                        System.out.println("穷举法获取的密码是："+str);
                        break;
                    }else{
                        tmpContainer.add(str);
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    if(tmpContainer.size() >0){
                        for(int i =0 ;i< tmpContainer.size();i++){
                            System.out.println(tmpContainer.get(i));
                            tmpContainer.remove(i);
                        }
                    }else {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        t2.setDaemon(true);
        t2.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }

    public static String getRandomString(int j){
        StringBuffer s = new StringBuffer();
        for(int i =0;i<j;i++){
            Random a = new Random();
            char b = (char) (a.nextInt(80)+48);
            s.append(b);
        }
        return s.toString();
    }

    public static void getStringContainer(){
        for(int i=48; i<=128; i++){
            for(int j=48; j<=128; j++){
                for(int k=48; k<=128; k++){
                    String ss = new StringBuffer().append((char) i).append((char) j).append((char) k).toString();
                    sc.add(ss);
                }
            }
        }
    }
}
