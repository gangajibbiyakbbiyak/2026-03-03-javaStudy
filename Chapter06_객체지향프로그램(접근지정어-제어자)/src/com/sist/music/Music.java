package com.sist.music;

import lombok.Getter;
import lombok.Setter;

// 데이터를 모아서 관리 => 데이터형 클래스 => 캡슐화
// MusicVO / MusicDTO / MusicEntity
// => 데이터를 보호하는 목적 / 한번에 모아서 전송하려는 목적 => 윈도우 / 브라우저
// 사용자 정의 데이터형 => 메모리 크기
@Getter // 읽기 기능 가능 => 값 읽기
@Setter // 쓰기 기능 가능 => 메모리 저장
public class Music {
	private int no;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
	//private String poster;
}
