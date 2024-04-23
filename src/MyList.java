public class MyList {
    public String wordsToBeReversed(String words) {
        StringBuilder reversedWordsBuilder = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (int count = 0; count < words.length(); count++) {
            char charred = words.charAt(count);
            if (charred != ' ') currentWord.append(charred);
            else {
                if (!currentWord.isEmpty()) {
                    if (!reversedWordsBuilder.isEmpty()) {
                        reversedWordsBuilder.insert(0, ' ');
                    }
                    reversedWordsBuilder.insert(0, currentWord);
                    currentWord.setLength(0);
                }
            }
        }
        if (!currentWord.isEmpty()) {
            if (!reversedWordsBuilder.isEmpty()) {
                reversedWordsBuilder.insert(0, ' ');
                reversedWordsBuilder.insert(0, currentWord);
            }

        }
        return reversedWordsBuilder.toString();
    }

    public boolean allLettersContainsAlphabet(String words) {
        boolean[] letterPresent = new boolean[26];
        String lowercaseWords = words.toLowerCase();
        for (int count = 0; count < lowercaseWords.length(); count++) {
            char ch = lowercaseWords.charAt(count);
            if (ch >= 'a' && ch <= 'z') {
                letterPresent[ch - 'a'] = true;
            }
        }
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }
        return true;
    }

    public int[] sortingNumbersInAnArray(int[] numbers) {
        for (int count = 0; count < numbers.length - 1; count++) {
            for (int index = count + 1; index < numbers.length; index++) {
                if (numbers[count] > numbers[index]) {
                    int temp = numbers[count];
                    numbers[count] = numbers[index];
                    numbers[index] = temp;
                }
            }
        }
        return numbers;
    }

    public int containerWithMostWater(int[] height) {
        int maxArea = 0;
        for (int count = 0; count < height.length - 1; count++) {
            for (int index = count + 1; index < height.length; index++) {
                int area = (index - count) * Math.min(height[count], height[index]);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int toFIndTheMissingNumber(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        return (numbers.length * (numbers.length + 1)) / 2 - sum;
    }
}

