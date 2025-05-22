package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        boolean isExit = false;
        int count = 1;

        List<String> contents = new ArrayList<>();
        List<String> authors = new ArrayList<>();

        while (!isExit) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            switch (command) {
                case "등록":
                    System.out.print("명언: ");
                    String content = scanner.nextLine();
                    System.out.print("작가: ");
                    String author = scanner.nextLine();
                    System.out.println((count++) + "번 명언이 등록되었습니다.");
                    contents.add(content);
                    authors.add(author);
                    break;

                case "목록":
                    System.out.println("번호  / 작가 / 명언");
                    System.out.println("----------------------");
                    printList(contents, authors);
                    break;

                case "종료":
                    isExit = true;
                    break;

                default:
                    System.out.println("잘못된 명령입니다.");
                    break;
            }
        }
    }

    public static void printList(List<String> c, List<String> a){
        for(int i = c.size()-1; i >= 0; i--){
            System.out.println(i+1 + " / " + a.get(i) + " / " + c.get(i));
        }
    }
}