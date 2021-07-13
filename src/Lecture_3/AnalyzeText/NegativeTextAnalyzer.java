package Lecture_3.AnalyzeText;

public class NegativeTextAnalyzer
        extends KeywordAnalyzer
        implements TextAnalyzer {
    private final String[] negativeSmile = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return negativeSmile;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
