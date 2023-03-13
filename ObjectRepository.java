package 실습;

import java.util.*;

public class ObjectRepository {
	private List<ObjectDTO> list = new ArrayList<>(); // 물건의 정보리스트
	private List<ObjectDTO> list2 = new ArrayList<>();
	
	public boolean save(ObjectDTO objectDTO) {
		return list.add(objectDTO);
	}
	
	public List<ObjectDTO> findAll(){
		return list;
	}
	public ObjectDTO findByObjectName(String pno) {
		for(ObjectDTO objectDTO : list) {
			if(objectDTO.getPno().equals(pno)){
				return objectDTO;
			}
		}
		return null;
	}
	
	public boolean update(ObjectDTO objectDTO , String bno) {
		for(ObjectDTO o : list) {
			if(o.getPno().equals(bno)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean delete (String bno) {
		for(ObjectDTO o : list) {
			if(o.getPno().equals(bno)) {
				list.remove(o);
				return true;
			}
		}
		return false;
	}
	public boolean savebuy(ObjectDTO buyobject) {
		return list.add(buyobject);
	}

}
