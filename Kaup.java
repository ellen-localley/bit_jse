package com.jse.app;

/*
 개발자님 키와 몸무게를 이용하여
 카우푸지수를 구하고
 그 결과 정상, 저체중, 비만 등으로 몸의 상태만
 알려주는 프로그램을 만들어 주세요. 
 체중 (kg)÷키²(㎡)
 */
public class Kaup {
	private double height;
	private double weight;

	public void setHeight(double height) {
		this.height = height/100;
	}

	public double getHeight() {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String calculate() {
		double kaup=weight/(height*height);
		String result="";
		
		if(5<kaup&&kaup<18.5) {
			result="저체중";
		}else if(18.5<=kaup&&kaup<23) {
			result="정상체중";
		}else if(23<=kaup&&kaup<25) {
			result="과체중";
		}else if(25<=kaup&&kaup<40){
			result="비만";
		}else {
			result="잘못된 값입니다";
		}
		
		return result;
	}

}
