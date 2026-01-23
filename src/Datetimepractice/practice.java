package Datetimepractice;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class practice {
    public static void run(){
        Instant start=Instant.now();
        ageCalculator();
        Instant end=Instant.now();
        System.out.println(Duration.between(start,end));
    }
    public static void ageCalculator(){
        Scanner sc=new Scanner(System.in); // yyyy:MMM:dd
        String[] s = sc.nextLine().split(":");
        LocalDate now=LocalDate.now();
        LocalDate dob=LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
        System.out.println(Period.between(now,dob));
    }

    public static void businessDays(Set<LocalDate> holidays){
        LocalDate d=LocalDate.of(2026,1,23);
        List<String> arr=new ArrayList<>();

        while(d.getYear()==2026){
            if (holidays.contains(d)){
                d=d.plusDays(1);
            }else if (d.getDayOfWeek()==SATURDAY || d.getDayOfWeek()==SUNDAY){
                d=d.plusDays(1);
            }else{
                System.out.println(d);
                d=d.plusDays(1);
            }
        }
    }

    public static void main(String[] args) {
//        run();

        ArrayList<String> s= new ArrayList<>(List.of(new String[]{
                "2026:001:01", // New Year’s Day
                "2026:001:26", // Republic Day
                "2026:002:17", // Maha Shivaratri
                "2026:003:06", // Holi
                "2026:004:03", // Good Friday
                "2026:004:21", // Ramadan Eid (Eid-ul-Fitr) - may vary based on moon sighting
                "2026:008:15", // Independence Day
                "2026:008:26", // Raksha Bandhan
                "2026:009:05", // Janmashtami
                "2026:009:17", // Ganesh Chaturthi
                "2026:010:02", // Gandhi Jayanti
                "2026:010:19", // Dussehra (Vijayadashami)
                "2026:011:08", // Diwali (Deepavali)
                "2026:011:24", // Guru Nanak Jayanti
                "2026:012:25"  // Christmas
        }));

        Set<LocalDate> holidays=new HashSet<>();

        for (String i : s){
            String[] j=i.split(":");
//            System.out.println(i);
            holidays.add(LocalDate.of(Integer.parseInt(j[0]),Integer.parseInt(j[1]),Integer.parseInt(j[2])));
        }

        businessDays(holidays);
    }
}