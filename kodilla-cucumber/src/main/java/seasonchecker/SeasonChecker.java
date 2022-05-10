package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public String checkIfSummer(MonthDay today){
        if (today.isAfter(MonthDay.of(6,20))
                && today.isBefore(MonthDay.of(9, 24))){
            return "Yes!Summer!";
        }
        return "Nope";
    }
}
