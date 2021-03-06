package com.aadyad.checkboxquestion;

import android.view.Gravity;
import android.widget.LinearLayout;

public class QuestionListSettings {

    public static final int TEXT_SIZE_DEFAULT = -1;
    public static final int TEXT_SIZE_AUTO = -2;

    private int checkBoxLocation;
    private float optionLayoutHeight;
    private int checkBoxOrientation;
    private int spacing;
    private float questionTextSize;
    private float checkBoxTextSize;
    private float questionLayoutHeight;

    public float getQuestionTextSize() {
        return questionTextSize;
    }

    public void setQuestionTextSize(float questionTextSize) {
        this.questionTextSize = questionTextSize;
    }

    public float getCheckBoxTextSize() {
        return checkBoxTextSize;
    }

    public void setCheckBoxTextSize(float checkBoxTextSize) {
        this.checkBoxTextSize = checkBoxTextSize;
    }



    public float getTextSize() {
        return questionTextSize;
    }

    public void setTextSize(int textSize) {
        this.questionTextSize = textSize;
    }

    public float getOptionLayoutHeight() {
        return optionLayoutHeight;
    }

    public float getQuestionLayoutHeight() {
        return questionLayoutHeight;
    }

    public void setTextHeight(int textHeight) {
        this.questionLayoutHeight = textHeight;
    }

    private boolean numEnabled;

    public QuestionListSettings(SettingsBuilder builder){
        checkBoxLocation = builder.checkBoxLocation;
        optionLayoutHeight = builder.optionLayoutHeight;
        checkBoxOrientation = builder.checkBoxOrientation;
        questionTextSize = builder.questionTextSize;
        questionLayoutHeight = builder.questionLayoutHeight;
        spacing = builder.spacing;
        numEnabled = builder.numEnabled;
        checkBoxTextSize = builder.optionBoxTextSize;
    }

    public int getCheckBoxLocation() {
        return checkBoxLocation;
    }

    public void setCheckBoxLocation(int checkBoxLocation) {
        this.checkBoxLocation = checkBoxLocation;
    }

    public int getCheckBoxOrientation() {
        return checkBoxOrientation;
    }

    public void setCheckBoxOrientation(int checkBoxOrientation) {
        this.checkBoxOrientation = checkBoxOrientation;
    }

    public int getSpacing() {
        return spacing;
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public boolean isNumEnabled() {
        return numEnabled;
    }

    public void setNumEnabled(boolean numEnabled) {
        this.numEnabled = numEnabled;
    }

    public static class SettingsBuilder {
        private int checkBoxLocation = Gravity.LEFT;
        private int checkBoxOrientation = LinearLayout.HORIZONTAL;
        private int spacing = 15;
        private boolean numEnabled = true;
        private float questionTextSize = QuestionListSettings.TEXT_SIZE_DEFAULT;
        private float optionBoxTextSize = QuestionListSettings.TEXT_SIZE_DEFAULT;
        private float questionLayoutHeight = QuestionListSettings.TEXT_SIZE_DEFAULT;
        private float optionLayoutHeight = QuestionListSettings.TEXT_SIZE_DEFAULT;


        public SettingsBuilder setCheckboxLocation(final int checkBoxLocation) {
            this.checkBoxLocation = checkBoxLocation;
            return this;
        }

        public SettingsBuilder setQuestionTextSize(final float textSize) {
            this.questionTextSize = textSize;
            return this;
        }

        public SettingsBuilder setOptionLayoutHeight(final float optionHeight) {
            this.optionLayoutHeight = optionHeight;
            return this;
        }

        public SettingsBuilder setQuestionLayoutHeight(final float questionHeight) {
            this.questionLayoutHeight = questionHeight;
            return this;
        }

        public SettingsBuilder setOptionTextSize(final float textSize) {
            this.optionBoxTextSize = textSize;
            return this;
        }

        public SettingsBuilder setCheckBoxOrientation(final int checkBoxOrientation) {
            this.checkBoxOrientation = checkBoxOrientation;
            return this;
        }

        public SettingsBuilder setSpacing(final int spacing) {
            this.spacing = spacing;
            return this;
        }

        public SettingsBuilder setNumberEnabled(final boolean numEnabled) {
            this.numEnabled = numEnabled;
            return this;
        }

        public QuestionListSettings create() {
            return new QuestionListSettings(this);
        }
    }
}
