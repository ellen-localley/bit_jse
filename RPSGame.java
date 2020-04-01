package com.jse.app;
import java.util.Random;
import java.util.Scanner;
public class RPSGame {
	public static void main(String[] args) {
		game();
	}
	static void game() {
		System.out.println("1.가위   2.바위   3.보   를 입력하세요");
		Scanner scanner=new Scanner(System.in);
		int user=scanner.nextInt();
		System.out.println("사용자의 값은 "+user+"입니다.");
		Random random=new Random();
		int com=random.nextInt(3)+1;
		String winner="무승부";
		if(user==1) {
			switch(com) {
			case 2: winner="컴퓨터"; break;
			case 3: winner="사용자"; break;
			}
		}else if(user==2) {
				switch(com) {
				case 1: winner="사용자"; break;
				case 3: winner="컴퓨터"; break;
			}
		}else if(user==3){
				switch(com) {
				case 1: winner="컴퓨터"; break;
				case 2: winner="사용자"; break;
			}
		}
		System.out.println("컴퓨터의 값은 "+com+"입니다.");
		System.out.println(winner+" 승리");
	}
		}

