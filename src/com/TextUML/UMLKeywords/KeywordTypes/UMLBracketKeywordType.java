package com.TextUML.UMLKeywords.KeywordTypes;

import com.TextUML.UMLKeywords.UMLKeywordTags;

public enum UMLBracketKeywordType implements UMLKeywordType {

    UMLBracketOpen("(", null),
    UMLBracketClose(")", null),
    UMLCurlyBracketOpen("{", UMLKeywordTags.OpenInnerPattern),
    UMLCurlyBracketClose("}", UMLKeywordTags.CloseInnerPattern);

    String string;
    UMLKeywordTags tag;

    UMLBracketKeywordType(String string, UMLKeywordTags tag){
        this.string = string;
        this.tag = tag;
    }

    @Override
    public String GetString() {
        return string;
    }

    @Override
    public boolean HasTag(UMLKeywordTags tag) {
        return this.tag == tag;
    }

}
