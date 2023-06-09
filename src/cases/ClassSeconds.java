package cases;    // cases 밑에 또 다른 하위폴더가 있다면 cases.하위폴더이름.하위폴더이름 이런식으로 표시함

public class ClassSeconds {
    public int third = 0;
    ClassSeconds () {

    }
    public ClassSeconds (int first) {  //접근지정자 public을 넣어줘야 함
        this.third = first;
        
    }
    public int getThird() {
        return this.third;
    }   
}
