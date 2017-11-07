package com.example.android.valequizapp;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SportsActivity extends AppCompatActivity {

    @Nullable
    @Override
    public ActionBar getSupportActionBar() {
        return super.getSupportActionBar();
    }

    /**
     * The number of correct answers
     */
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void end_Test(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_field_sports);
        String name = nameField.getText().toString();

        //Called question checking methods
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();


        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);

        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button_sports);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name of the passing the test
     * @param score of the counting of right answers
     * @return text of the test result
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(R.string.test_result_score) + score;
        return test_result;
    }

    /**
     * This method counter correct answers in question 1
     * "Which of the following are the primary goals of network security? (Choose 3 best answers)"
     */
    public void question_1() {
        // Figure out if the user chose "Availability" answer
        CheckBox AvailabilityyyyCheckBox = (CheckBox) findViewById(R.id.availabilityyyy_checkbox);
        boolean hasAvailabilityyyy = AvailabilityyyyCheckBox.isChecked();

        if (hasAvailabilityyyy) {
            increment_score();
        }

        // Figure out if the user chose "Integrity" answer
        CheckBox IntegrityyyyCheckBox = (CheckBox) findViewById(R.id.integrityyyy_checkbox);
        boolean hasIntegrityyyy = IntegrityyyyCheckBox.isChecked();

        if (hasIntegrityyyy) {
            increment_score();
        }

        // Figure out if the user chose "Confidentiality" answer
        CheckBox ConfidentialityyyyCheckBox = (CheckBox) findViewById(R.id.confidentialityyyy_checkbox);
        boolean hasConfidentialityyyy = ConfidentialityyyyCheckBox.isChecked();

        if (hasConfidentialityyyy) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 2
     * "Which of the following statements best describes confidentiality of information?"
     */
    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_22);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_2_2_2_2radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_2_2_2radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_3_3_3radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_3_3_3radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_4_4_4radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 3
     * "According to Cisco, organizational data is classified into four categories. Which of the following is NOT classification category?"
     */
    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_33);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.trusty_worthy_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.trusty_worthy_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.tech111_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.tech2222_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.tech3333_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.tech4444_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 4
     * "What are the THREE security solution that Cisco recommends for comprehensive security?"
     */
    public void question_4() {
        // Figure out if the user chose "Physical" answer
        CheckBox PhysicalCheckBox = (CheckBox) findViewById(R.id.redundancy111_checkbox);
        boolean hasPhysical = PhysicalCheckBox.isChecked();

        if (hasPhysical) {
            increment_score();
        }

        // Figure out if the user chose "Logical" answer
        CheckBox LogicalCheckBox = (CheckBox) findViewById(R.id.redundancy222_checkbox);
        boolean hasLogical = LogicalCheckBox.isChecked();

        if (hasLogical) {
            increment_score();
        }

        // Figure out if the user chose "Administrative" answer
        CheckBox AdministrativeCheckBox = (CheckBox) findViewById(R.id.redundancy444_checkbox);
        boolean hasAdministrative = AdministrativeCheckBox.isChecked();

        if (hasAdministrative) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 5
     * "Which of the following is true about Dynamic ARP Inspection (DAI) employed in a network switch? (Choose 3 best answers)"
     */
    public void question_5() {
        // Figure out if the user chose "Intercept and examine all ARP request and response packets in a subnet and discard packets with invalid IP-to-MAC address bindings" answer
        CheckBox Answer_5_1_1CheckBox = (CheckBox) findViewById(R.id.answer_5_1_1checkbox);
        boolean hasAnswer_5_1_1CheckBox = Answer_5_1_1CheckBox.isChecked();

        if (hasAnswer_5_1_1CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "DAI can prevent common man-in-the-middle (MIM) attacks such as ARP cache poisoning" answer
        CheckBox Answer_5_2_2CheckBox = (CheckBox) findViewById(R.id.answer_5_2_2checkbox);
        boolean hasAnswer_5_2_2CheckBox = Answer_5_2_2CheckBox.isChecked();

        if (hasAnswer_5_2_2CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Prevents mis-configuration of client IP addresses" answer
        CheckBox Answer_5_3_3CheckBox = (CheckBox) findViewById(R.id.answer_5_3_3checkbox);
        boolean hasAnswer_5_3_3CheckBox = Answer_5_3_3CheckBox.isChecked();

        if (hasAnswer_5_3_3CheckBox) {
            increment_score();
        }
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view_sports);
        testResultTextView.setText(result);
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;
    }
}
