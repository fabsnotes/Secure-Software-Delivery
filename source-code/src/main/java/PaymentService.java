public class PaymentService {
    private static final String INTERNAL_API = System.getenv().getOrDefault(
            "INTERNAL_API_URL",
            "https://example.internal/api"
    );

    private static final String FALLBACK_TOKEN = System.getenv("FALLBACK_TOKEN");

    public String getInternalApi() {
        return INTERNAL_API;
    }

    public String getFallbackToken() {
        return FALLBACK_TOKEN;
    }
}
