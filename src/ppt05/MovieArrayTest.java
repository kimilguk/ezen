package ppt05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Movie {//영화정보 클래스
	private String title;//영화제목
	private String director;//영화감독
	private int runningTime;//상영시간(분)
	
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getRunningTime() {
		return runningTime;
	}
	//get,set 을 사용하지 않고, 데이터를 입력하는 방법=생성자를 사용
	public Movie(String title, String director, int runningTime) {
		this.title = title;
		this.director = director;
		this.runningTime = runningTime;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", runningTime=" + runningTime + "]";
	}	
	
}
public class MovieArrayTest {

	public static void main(String[] args) {
		Integer[] questions = {3, 1, 4, 1, 5, 9};//문제별 난이도
		Arrays.sort(questions);//오른차순 정렬
		Arrays.sort(questions, Comparator.reverseOrder());//내림차순 정렬
		System.out.println(questions[0] + "~" + questions[5]);
		//영화정보를 임시저장하는 클래스 Movie 생성
		Movie[] movies = new Movie[2];//배열객체 생성1
		movies[0] = new Movie("에일리언2", "제임스카메론", 120);
		movies[1] = new Movie("티파니에서 아침을", "에드워드 블레이크", 110);
		System.out.println(movies[0].toString() + movies[1].toString());
		//표준 Json 데이터형식이 아니다
		List<Movie> movieList = new ArrayList<Movie>();//배열객체 생성2
		movieList.add(new Movie("에일리언2", "제임스카메론", 120));
		movieList.add(new Movie("티파니에서 아침을", "에드워드 블레이크", 110));//입력
		
		//아래와 같이 객체를 생성하면서, 구현 내용을 작성하는 방식을 익명클래스 방식을 객체를 구현한다.
//		movieList.sort(new Comparator<Movie>() {
//
//			@Override
//			public int compare(Movie o1, Movie o2) {
//				String compare1 = o1.getTitle();
//				String compare2 = o2.getTitle();
//				return compare2.compareTo(compare1);//오름차순 -> 내림차순으로 변경
//			}
//			
//		});
		//위 익명클래스를 람다식으로 변경(아래)
		movieList.sort((Movie o1, Movie o2) -> {
			String compare1 = o1.getTitle();
			String compare2 = o2.getTitle();
			return compare2.compareTo(compare1);//오름차순 -> 내림차순으로 변경
		});
		System.out.println(movieList);//.toString() 생략된 상황
		
		//배열객체 생성3(아래) 맵 데이터를 사용(Key,Value)
		Map<String, Object> movieMap1 = new HashMap<String, Object>();
		movieMap1.put("title", "에일리언2");
		movieMap1.put("director", "제임스카메론");
		movieMap1.put("runningTime", 120);
		Map<String, Object> movieMap2 = new HashMap<String, Object>();
		movieMap2.put("title", "티파니에서 아침을");
		movieMap2.put("director", "에드워드 블레이크");
		movieMap2.put("runningTime", 110);
		List<Map> movieMapList = new ArrayList<Map>();
		movieMapList.add(movieMap1);
		movieMapList.add(movieMap2);
		System.out.println(movieMap1.get("title"));
		for(Map movieMap:movieMapList) {
			System.out.println(movieMap.get("title") + ":" + movieMap.get("runningTime"));
		}
		movieMapList.sort((Comparator<? super Map>) new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				String name1 = (String) o1.get("title");
				String name2 = (String) o2.get("title");
				return name2.compareTo(name1);//여기를 name1,2를 변경하면 오름차순 -> 내림차순으로 변경됨
			}
			
		});
		System.out.println(movieMapList);//표준 json에 맞게 배열객체 데이터 생성.
	}
}
