class Solution {
    public String reorderSpaces(String text) {
        int spaceCount = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                spaceCount++;
            }
        }
        String[] words = text.trim().split("\\s+");
        if (words.length == 1) {
            return words[0] + " ".repeat(spaceCount);
        }
        int spacesBetween = spaceCount / (words.length - 1);
        int remainingSpaces = spaceCount % (words.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ".repeat(spacesBetween));
            }
        }
        sb.append(" ".repeat(remainingSpaces));

        return sb.toString();
    }
}
