package ch7.adapter.book;

public class Demo {
    public static void main(String[] args) {
        Duck donalDuck = new DonalDuck();
        Pigeon cityPigeon = new CityPigeon();
        PigeonAdapter pigeonAdapter = new PigeonAdapter(cityPigeon); // pigeon을 duck처럼 쓸수 있게 해주는 어댑터

        Duck pigeonAdapter2 = new PigeonAdapter(cityPigeon); // 이렇게도 가능!

        pigeonAdapter.fly();
        pigeonAdapter.quack(); // we can call this method thanks to adapter!!


        Pigeon duckAdapter = new DuckAdapter(donalDuck); // 반대 방향의 어댑터!
        duckAdapter.fly();
        duckAdapter.googoo();
    }
}
