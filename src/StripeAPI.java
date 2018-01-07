import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Account;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

public class StripeAPI {

    public static void main(String args[]) {

       String STRIPE_API_KEY= "sk_test_a1TQRGlP8mOFYV7svLFuGanH";
       Stripe.apiKey= "sk_test_a1TQRGlP8mOFYV7svLFuGanH";

        RequestOptions requestOptions = RequestOptions.builder().setApiKey(STRIPE_API_KEY).build();
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("description", "Customer for emily.jones@example.com");
        customerParams.put("description", "Customer for ssdf@gmail.com");
        customerParams.put("description", "Customer for masghiosa@gmail.com");
        customerParams.put("source", "tok_mastercard");

        try {
//            System.out.println(customerParams);
            Customer customer = Customer.retrieve("cus_C5e5a8H66Aupdt", requestOptions);
            String email= customer.getEmail()
            System.out.println(email);
        } catch (StripeException e) {
            e.printStackTrace();
        }


    }
}
