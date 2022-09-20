package com.example.lab1_datntph14484_java5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lab2 {

    @GetMapping("bai1")
    public String bai1(@RequestParam("str1") String str1 ,@RequestParam("str2") String str2, Model model){

        if(str1.length()>str2.length()){
            model.addAttribute("str", str1);
        }else if(str2.length()>str1.length()){
            model.addAttribute("str", str2);
        }else{
            model.addAttribute("str", "Hai chuỗi có độ dài bằng nhau");
        }

        return "baitap1";
    };

    @GetMapping("bai2")
    public  String bai2(@RequestParam("str") StringBuilder  str, Model model){

        model.addAttribute("str", str.reverse().toString());

        return "baitap2";
    }

    @GetMapping("bai3")
    public String bai3(@RequestParam("number") int nb, Model model){
        if(nb<2){
            model.addAttribute("number",2);
        }else{

            int number = nb+1;

            while (!isPrimeNumber(number)){
                number ++;

            }
            model.addAttribute("number",number);

        }

        return "baitap3";


    }

    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
