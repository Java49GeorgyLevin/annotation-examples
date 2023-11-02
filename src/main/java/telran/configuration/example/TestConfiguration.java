package telran.configuration.example;


import lombok.Data;
import telran.configuration.annotation.Value;
@Data
public class TestConfiguration {
	@Value("app.int:10")
	int i;
	@Value("app.long:1000000")
	long l;
	@Value("app.float.:0.5")
	float f;
	@Value("app.double:10.5")
	double d;
	@Value("app.string")
	String s;
	
	
}
