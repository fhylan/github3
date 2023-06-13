package bai1;
import java.util.Scanner;
public class bai101 {
        public static void main(String[] args) {
            String chuoi;
            StringBuilder str= new StringBuilder();
            Scanner sc=new Scanner(System.in);
            System.out.println(" nhap gi cung duoc: ");
            chuoi=sc.nextLine();
            chuoi=chuoi.toLowerCase(); // hàm dùng để in thường các kí tự
            char []c=new char[chuoi.length()];
            for(int i=0;i<c.length;i++) {
                c[i]=chuoi.charAt(i);
            }
            for(int i=0;i<c.length;i++) {
                if(i == 0 || c[i - 1] == ' '){
                    if(c[i]>='a'&&c[i]<='z'){
                        c[i] = (char) (c[i] - 32);
                    }
                }else{
                    if(c[i]>='A'&&c[i]<='Z'){
                        c[i] = (char) (c[i] + 32);
                    }
                }
            }
            for (char value : c) {
                str.append(value);
            }
            System.out.println(str);

        }

    }
