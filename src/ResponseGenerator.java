import java.util.Random;

public class ResponseGenerator {

	public static final String PROPERTY_SPACE = " ";

	String generateResponse() {
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		builder.append(Responses.RESPONSE_FIRST_PART[random.nextInt(10)]);
		builder.append(PROPERTY_SPACE);
		builder.append(Responses.RESPONSE_SECOND_PART[random.nextInt(10)]);
		builder.append(PROPERTY_SPACE);
		builder.append(Responses.RESPONSE_THIRD_PART[random.nextInt(10)]);
		builder.append(PROPERTY_SPACE);
		builder.append(Responses.RESPONSE_FOURTH_PART[random.nextInt(10)]);

		return builder.toString();
	}

}
