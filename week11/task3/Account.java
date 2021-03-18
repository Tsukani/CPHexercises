public class Account {
    private String name;
    private long card_Number;
    private String payment_Type;
    private String city;
    private String state;
    private String country;
    private String account_Created;
    private String last_Login;

    Account(String name, long card_Number, String payment_Type, String city, String state, String country, String account_Created, String last_Login) {
        this.name = name;
        this.card_Number = card_Number;
        this.payment_Type = payment_Type;
        this.city = city;
        this.state = state;
        this.country = country;
        this.account_Created = account_Created;
        this.last_Login = last_Login;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }


    void setCardNumber(long cardNumber) {
        //Luhn
        String cardNumberString = String.valueOf(cardNumber);
        int totalSum = 0;
        for (int i = cardNumberString.length() - 1; i >= 0; i--) {
            int d = Integer.parseInt(cardNumberString.substring(i, i+1));
            System.out.println(d);
            if (i%2==0) {
                d*=2;
                if (d>9) {
                    int sum = 0;
                    for (int j = 0; j < String.valueOf(d).length(); j++) {
                        sum += Integer.parseInt(String.valueOf(d).substring(j, j+1));
                    }
                    d = sum;
                }
            }
            totalSum += d;
        }
        System.out.println(totalSum);
        System.out.printf("The card number does %sfulfil the Luhn algorithm%n", (totalSum % 10 == 0) ? "" : "not ");
        this.card_Number = cardNumber;
    }
    long getCardNumber() {
        return card_Number;
    }


    void setPaymentType(String cardType) {
        this.payment_Type = cardType;
    }
    String getPaymentType() {
        return payment_Type;
    }


    void setCity(String city) {
        this.payment_Type = city;
    }
    String getCity() {
        return city;
    }


    void setState(String state) {
        this.payment_Type = state;
    }
    String getState() {
        return state;
    }


    void setCountry(String country) {
        this.country = country;
    }
    String getCountry() {
        return country;
    }


    void setAccountCreated(String accountCreated) {
        this.account_Created = accountCreated;
    }
    String getAccountCreated() {
        return account_Created;
    }


    void setLastLogin(String lastLogin) {
        this.last_Login = lastLogin;
    }
    String getLastLogin() {
        return last_Login;
    }

    @Override
    public String toString() {
        //JSON format
        return String.format("{name: \"%s\", card_Number: %d, payment_Type: \"%s\", city: \"%s\", state: \"%s\", country: \"%s\", account_Created: \"%s\", last_Login: \"%s\"}",
            getName(), getCardNumber(), getPaymentType(), getCity(), getState(), getCountry(), getAccountCreated(), getLastLogin());
    }
}