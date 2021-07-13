package Lecture_3.AnalyzeText;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    public Label processText(String text) {
        String[] keyWords = getKeywords();
        for (String s : keyWords) {
            if (text.contains(s)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
}
