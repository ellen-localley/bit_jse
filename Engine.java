package com.jse.app;
import java.util.Random;
import java.util.Scanner;
public class Engine {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Member member=new Member();
		Calculator calculator=new Calculator();
		Dice dice=new Dice();
		Random random=new Random();
		RPSGame rpsGame=new RPSGame();
		
		while(true) {
			System.out.println("0.종료   "
					+ "1.회원가입   "
					+ "2.로그인   "
					+ "3.계산기   "
					+ "4.주사위 홀짝 맞추기 게임   "
					+ "5.1부터 100까지의 합   "
					+ "6.가위바위보   ");
			int flag=scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			
			case 1: System.out.println("회원가입");
				System.out.println("아이디 입력");
				String id=scanner.next();	
				member.setId(id);
				break;
				
			case 2: 
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2=scanner.next();
				String returnId=member.getId();
				System.out.println("로그인된 아이디: "+returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
				
			case 3:
				System.out.println("계산기");
				System.out.println("첫번째 수 입력");
				int num1=scanner.nextInt();
				calculator.setNum1(num1);
				System.out.println("두번째 수 입력");
				int num2=scanner.nextInt();
				calculator.setNum2(num2);
				int returnNum1=calculator.getNum1();
				int returnNum2=calculator.getNum2();
				int c=calculator.calculator();
				System.out.println("두 수의 합 "+c);
				break;
				
			case 4:
				System.out.println("*** 주사위 홀짝 맞추기 게임 ***");
				System.out.println("기대하는 값 홀/짝을 입력해주세요");
				String expect=scanner.next();
				System.out.println(String.format("사용자 입력값: %s", expect));
				dice.setExpect(expect);
				int com=random.nextInt(6)+1;
				System.out.println(String.format("컴퓨터 생성값: %d", com));
				dice.setCom(com);
				String result=dice.switchDice();
				
				switch(com) {
				case 1: case 3: case 5: result="홀"; break;
				case 2: case 4: case 6: result="짝"; break;
				}
				String result2="틀림";
				if(expect.equals(result)) {
					result2="맞음";
				}
				System.out.println("컴퓨터 결과값: "+result);
				System.out.println(String.format("매칭 결과: %s", result2));
				break;
				
			case 5: sum();
				break;
				
			case 6:
				System.out.println("1.가위   2.바위   3.보   를 입력하세요");
				int user=scanner.nextInt();
				System.out.println("사용자의 값은 "+user+"입니다.");
				rpsGame.setUserValue(user);
				int rps=random.nextInt(3)+1;
				System.out.println("컴퓨터의 값은 "+rps+"입니다.");
				rpsGame.setComputerValue(rps);
				rpsGame.game();
				break;
			}
		}
	}

	static void sum() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(String.format("1부터 100까지의 합: %d", sum));
	}
}
