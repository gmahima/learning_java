class PezDispenser {
    private String characterName;

    public PezDispenser(java.lang.String s) {
        this.characterName = s;
    }

    public String getCharacterName() { return this.characterName; }

    public String swapHead(java.lang.String s) {
        String returnVal = this.characterName;
        this.characterName = s;
        return returnVal;
    }
}