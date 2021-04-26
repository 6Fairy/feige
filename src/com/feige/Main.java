package com.feige;

import com.feige.service.LoginService;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
   public  Main(){
   }
   boolean flag = true;

    public  void meau(){
        while (flag){
            System.out.println("*****************************");
            System.out.println("***\t欢迎使用购物系统\t***");
            System.out.println("*******************************");
            System.out.println("1.用户注册");
            System.out.println("2.登陆系统");
            System.out.println("3.商品查看");
            System.out.println("4.退出系统");
            LoginService loginService=  new LoginService(sc);
            System.out.println("请输入：");
            int funNO = sc.nextInt();

            switch (funNO){
                case 1 :
                    //用户注册

                    break;
                case 2 :
                    //登录系统

                    break;
                case 3 :
                    //商品查看
                    break;
                case 4 :
                default:
                    System.out.println("退出系统");
                    sc.close();//把输入流关闭
                    flag=false;
                    System.exit(0);//0 正常退出   非0参数 不正常中断

        }

        }
    }
    public static void main(String[] args) {
        new Main().meau();
    }
}


