public class ClassFirsts {
    int second = 0;    // 변수 second를 초기화시킴, second는 생성자 2개 모두에 사용가능
    ClassFirsts(){
        System.out.println();
    }
    ClassFirsts(int first){
        this.second = first;
        System.out.println(first);
    }
    
    public int getSecond(){
        return this.second;  // 이 클래스 내부에 있는 변수라는 것을 알려주기 위해 this. 을 붙여서 변수를 불러옴.
    }
}
