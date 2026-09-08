class Solution {
    public boolean backspaceCompare(String s, String t) {
        int l = s.length() - 1;
        int r = t.length() - 1;
        while (l >= 0 || r >= 0) {
            if ((l >= 0 && s.charAt(l) == '#') || (r >= 0 && t.charAt(r) == '#')) {
                if (l >= 0 && s.charAt(l) == '#') {
                    int c = 0;
                    while (l >= 0 && (s.charAt(l) == '#' || c > 0)) {
                        if(s.charAt(l) == '#'){
                            c++;
                        }else if(c > 0 && s.charAt(l) != '#'){
                            c--;
                        }
                        l--;
                    }
                }
                if (r >= 0 && t.charAt(r) == '#') {
                    int c = 0;
                    while (r >= 0 && (t.charAt(r) == '#' || c > 0)) {
                        if(t.charAt(r) == '#'){
                            c++;
                        }else if(c > 0 && t.charAt(r) != '#'){
                            c--;
                        }
                        r--;
                    }
                }
            }else if(l == -1 || r == -1){
                return false;
            }else {
                if (r >= 0 && l >= 0) {
                    if (s.charAt(l) != t.charAt(r)) {
                        return false;
                    } else {
                        l--;
                        r--;
                    }
                }
            }
        }
        if (l >= 0 || r >= 0) {
            return false;
        }
        return true;
    }
}