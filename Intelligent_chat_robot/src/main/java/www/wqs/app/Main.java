package www.wqs.app;

import www.wqs.entity.Response;
import www.wqs.service.Service;
import www.wqs.utils.Httputils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("直接在下方描述你的问题既可");
        System.out.println("如果要退出输入exit");
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                String mes = scanner.nextLine();
                if ("exit".equals(mes)) {
                    return;
                }
                Response response = Service.getResponse(Httputils.getresponse(mes));
                System.out.println(response.getContent());
            }catch (NullPointerException e){
                System.out.println("很抱歉，我不能回答这个问题");
            }
        }
    }
}
