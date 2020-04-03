package com.jse.app;

public class RPSGame {
	public RPSGame() {
		// TODO Auto-generated constructor stub
	}
	private int userValue;
	private int computerValue;
	
	public void setUserValue(int user) {
		this.userValue=user;
	}
	
	public int getUserValue() {
		return userValue;
	}
	
public void setComputerValue(int rps) {
		this.computerValue=rps;
	}
	
	public int getComputerValue() {
		return computerValue;
	}
	
	public String game() {
		String winner="무승부";
		if(userValue==1) {
			switch(computerValue) {
			case 2: winner="컴퓨터 승리"; break;
			case 3: winner="사용자 승리"; break;
			}
		}else if(userValue==2) {
				switch(computerValue) {
				case 1: winner="사용자 승리"; break;
				case 3: winner="컴퓨터 승리"; break;
			}
		}else if(userValue==3){
				switch(computerValue) {
				case 1: winner="컴퓨터 승리"; break;
				case 2: winner="사용자 승리"; break;
			}
		}
		System.out.println(winner);
		return "";
	}
	
}