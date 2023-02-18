public class SolwestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int index = 0;
        int great = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] > great) {
                great = releaseTimes[i] - releaseTimes[i - 1];
                index = i;
            } else if (releaseTimes[i] - releaseTimes[i - 1] == great) {
                great = releaseTimes[i] - releaseTimes[i - 1];
                if (keysPressed.charAt(index) < keysPressed.charAt(i)) {
                    index = i;
                }
            }
        }
        return keysPressed.charAt(index);
    }
}
