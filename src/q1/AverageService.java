package q1;

import com.q1.AverageResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AverageService {
    private List<Integer> numbers = new ArrayList<>();

    public AverageResponse addNumber(int number) {
        List<Integer> prevState = new ArrayList<>(numbers);
        numbers.add(number);

        AverageResponse response = new AverageResponse();
        response.setWindowPrevState(prevState);
        response.setWindowCurrState(new ArrayList<>(numbers));
        response.setNumbers(new ArrayList<>(numbers));
        response.setAvg(calculateAverage(numbers));

        return response;
    }

    private double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
