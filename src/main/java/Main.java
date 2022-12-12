public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTyped(true);
        clock.setName("name1");
        clock.setMark("neymar");
        clock.setCost(100);

        Clock clock1 = new Clock();
        clock1.setTyped(false);
        clock1.setName("name2");
        clock1.setCost(10);
        clock1.setMark("ramyen");

        ClockDAO dao = new ClockDAO();

//        dao.add(clock);
//        dao.add(clock1);

        Clock clock2 = dao.findById(6);
        System.out.println(clock2);
    }
}
