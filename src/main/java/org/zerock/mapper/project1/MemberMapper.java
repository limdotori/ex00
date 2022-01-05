package org.zerock.mapper.project1;

import java.util.List;

import org.zerock.domain.project1.MemberVO;

public interface MemberMapper {
	
	public int insert(MemberVO member);
	
	public MemberVO select(String id);
	
	public int update(MemberVO member);
	
	public int delete(String id);
	
	//모든 게시물을 조회
	public List<MemberVO> list(); //연습삼아 만들기
	
	
}
