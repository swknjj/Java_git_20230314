package 실습;

import java.util.List;
import java.util.Scanner;


public class ObjectService {
	
	Scanner sc = new Scanner(System.in);
	ObjectRepository br = new ObjectRepository();
	
	public void save() {
		ObjectDTO objectDTO = new ObjectDTO();
		System.out.print("등록할 상품이름입력> ");
		objectDTO.setOName(sc.next());
		System.out.print("등록할 수량입력> ");
		objectDTO.setEa(sc.nextInt());
		System.out.print("개당 가격 입력> ");
		objectDTO.setCell(sc.nextInt());
		boolean success = br.save(objectDTO);
		if(success) {
			System.out.println();
			System.out.println("상품번호: "+objectDTO.getPno()+" / "+objectDTO.getOName()+"가 등록되었습니다");
		}else {
			System.out.println("상품등록 실패!");
		}
	}
	public void findAll() {
		List<ObjectDTO> list = br.findAll();
		System.out.println("상품번호\t상품명\t남은수량\t개당가격\t올린시간");
		System.out.println("===========================================");
		if(list.size() == 0 ) {
			System.out.println("없다");
		}
		for(ObjectDTO objectDTO : list) {
			objectDTO.print();
		}
	}
	public void check() {
		List<ObjectDTO> list = br.findAll();
		if(list.size() == 0 ) {
			System.out.println("없다");
		}
	}
	public void findByObjectName() {
		System.out.println("상품번호 입력> ");
		String pno = sc.next();
		ObjectDTO objectDTO = br.findByObjectName(pno);
		if(objectDTO == null) {
			System.out.println("상품명이 없음");
		}
		else {
			System.out.println("상품번호\t상품명\t남은수량\t개당가격\t올린시간");
			System.out.println("===========================================");
			objectDTO.print();
		
	}

	}
	
	public void update() {
		System.out.print("수정할 상품번호 입력>");
		String bno = sc.next();
		ObjectDTO objectDTO = br.findByObjectName(bno);
		if(objectDTO == null) {
			System.out.println("상품번호가 없습니다");
		}else {
			ObjectDTO object = new ObjectDTO();
			System.out.print("바꿀 상품이름 입력>");
			object.setOName(sc.next());
			System.out.print("바꿀 수량입력>");
			object.setEa(sc.nextInt());
			System.out.print("바꿀 가격 입력>");
			object.setCell(sc.nextInt());
			br.update(object, bno);
			if(br.update(object, bno)) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		}
		
	}
	public void delete() {
		System.out.println("삭제할 상품번호 입력");
		String bno = sc.next();
		ObjectDTO o = br.findByObjectName(bno);
		if(o == null) {
			System.out.println("상품번호가 없습니다");
		}else {
			if(br.delete(bno)) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		}
	}
	public void buyobject() {
		ObjectDTO buyobject = new ObjectDTO();
		System.out.print("구매할 상품이름입력> ");
		buyobject.setOName(sc.next());
		System.out.print("구매할 수량입력> ");
		buyobject.setEa(sc.nextInt());
		boolean success = br.savebuy(buyobject);
		if(success) {
			System.out.println();
			System.out.println("상품이름: "+buyobject.getOName()+" / "+buyobject.getBuyea()+"개가 등록되었습니다");
		}else {
			System.out.println("상품구매 실패!");
		}
	
	}
	}

