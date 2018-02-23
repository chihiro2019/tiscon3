package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank(message="お名前(漢字)を必ず入力してください")
    @Size(max = 60)
    private String kanjiName;

    @NotBlank(message="お名前(カタカナ)を必ず入力してください")
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$", message="お名前（カタカナ）はカタカナで入力してください")
    private String kanaName;

    @NotBlank(message="お名前(ローマ字)を必ず入力してください")
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$", message="お名前（ローマ字）はローマ字で入力してください")
    private String alphabetName;

    @NotBlank(message="生年月日を必ず入力してください")
    @Size(max = 10)
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$", message="生年月日は半角数字で入力してください")
    private String dateOfBirth;

    @NotBlank(message="性別を必ず入力してください")
    @Size(max = 6)
    private String gender;

    @NotBlank(message="郵便番号を必ず入力してください")
    @Size(max = 7)
    @Pattern(regexp = "^[0-9]{3}[0-9]{4}$", message="郵便番号は半角数字で入力してください")
    private String zipCode;

    @NotBlank(message="住所を必ず入力してください")
    @Size(max = 255)
    private String address;

    @NotBlank(message="自宅電話番号を必ず入力してください")
    @Size(max = 10)
    @Pattern(regexp = "^0[0-9]{1,3}[0-9]{2,4}[0-9]{4}$", message="自宅電話番号は半角数字で入力してください")
    private String homePhoneNumber;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090)[0-9]{4}-[0-9]{4})?$", message="携帯電話番号は半角数字で入力してください")
    private String mobilePhoneNumber;

    @NotBlank(message="メールアドレスを必ず入力してください")
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank(message="配偶者を必ず入力してください")
    @Size(max = 20)
    private String spouse;

    @NotBlank(message="お住まいを必ず入力してください")
    @Size(max = 20)
    private String houseClassification;

    @NotBlank(message="ローン等のお借り入れ金額を必ず入力してください")
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*", message="お借り入れ金額は半角数字で入力してください")
    private String debt;

    @NotBlank(message="ご職業を必ず入力してください")
    @Size(max = 120)
    private String job;

    @NotBlank(message="昨年の所得を必ず入力してください")
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*", message="昨年の所得は半角数字で入力してください")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}[0-9]{4})?$", message="勤務地郵便番号は半角数字で入力してください")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}[0-9]{2,4}[0-9]{4})?$", message="勤務地電話番号は半角数字で入力してください")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*", message="勤続年数は半角数字で入力してください")
    private String employeeLength;

}