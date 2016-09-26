import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

public class PhoneEnumTest {


    public static class Phone
    {

        @Id
        private Long id;

        @Column(name = "phone_number")
        private String number;

        @Enumerated(EnumType.ORDINAL)
        @Column(name = "phone_type")
        private PhoneType type;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public PhoneType getType() {

            return type;
        }

        public void setType(PhoneType type) {
            this.type = type;
        }

        public Long getId() {

            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }


}
