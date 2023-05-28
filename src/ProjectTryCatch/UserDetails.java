package ProjectTryCatch;

import java.util.Scanner;

public class UserDetails {
    private String FirstName;
    private String LastName;
    private String email;
    private String phoneNumber;
    private String postalCode;

    void getDetails() throws NameValidationException,EmailValidationException,PhoneNumberValidationException,PostalCodeValidationException {
        Scanner sc = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("Please Enter the First Name");
                FirstName = sc.next();
                if (FirstName.length() > 10) {
                    throw new NameValidationException("Name cannot be longer than 10 characters");
                }
            } catch (NameValidationException NVE) {
                System.out.println(NVE.toString());
                continue;
            }
            break;
        }


        while (true) {
            try {
                System.out.println("Please Enter the Last Name");
                LastName = sc.next();
                if (LastName.length() > 10) {
                    throw new NameValidationException("Last Name cannot be longer than 10 characters");
                }
            } catch (NameValidationException NVE) {
                System.out.println(NVE.toString());
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Please Enter the email");
                email = sc.next();
                if (!email.contains("@")) {
                    throw new EmailValidationException("email must contain @");
                }
            } catch (EmailValidationException EVE) {
                System.out.println(EVE.toString());
                continue;

            }
            break;
        }


        while(true) {
            try{
                System.out.println("Please Enter the Phone Number");
                phoneNumber = sc.next();
                if (phoneNumber.length() != 12) {
                    throw new PhoneNumberValidationException("Phone number must be 12 digits long");
                }
            }catch (PhoneNumberValidationException PNVE){
                System.out.println(PNVE.toString());
                continue;

            }
            break;
        }
        while(true) {
            try{
                System.out.println("Please Enter the Postal Code");
                postalCode = sc.next();
                if (!postalCode.contains("L8R")) {
                    throw new PostalCodeValidationException("postal code must be from L8R region");
                } else if (postalCode.length() !=6) {
                    throw new PostalCodeValidationException("postal code must be 6 digits");
                }

            }catch (PostalCodeValidationException PCVE){
                System.out.println(PCVE.toString());
                continue;

            }
            break;
        }


        System.out.println("User Details Saved Successfully");
    }
}