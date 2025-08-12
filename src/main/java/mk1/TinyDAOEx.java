package mk1;

import java.util.List;

import dao.TinyDAO;
import dto.TinyDTO;

public class TinyDAOEx {
	public static void main(String[] args) {
		TinyDAO dao = new TinyDAO();
	
		dao.Oneinsert(new TinyDTO(7, "사랑합니다"));
		
		List<TinyDTO> list =  dao.selectList();
		for(TinyDTO dto : list) {
			System.out.println(dto);
		}
	}
}
