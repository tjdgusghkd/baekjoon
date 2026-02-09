class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String rotated = A;

        for (int i = 0; i < A.length(); i++) {
            if (rotated.equals(B)) {
                answer = i;
                break;
            }

            rotated = rotated.charAt(A.length() - 1)
                    + rotated.substring(0, A.length() - 1);
        }
        return answer;
    }
}