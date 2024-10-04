public String decrypt(String encryptedText) {
    StringBuilder decrypted = new StringBuilder();
    for (char c : encryptedText.toCharArray()) {
        if (symbols.contains(c)) {
            int index = getSymbolIndex(c);
            decrypted.append(getAlphabet(index));
        } else {
            return "Error: Invalid Symbol";
        }
    }
    return decrypted.toString();
}
