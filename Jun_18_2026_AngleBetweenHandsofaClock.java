// https://leetcode.com/problems/angle-between-hands-of-a-clock/solutions/8340842/beats-100-clock-angles-made-easy-with-dr-0mw3/?envType=daily-question&envId=2026-06-18
class Solution {
    public double angleClock(int hour, int minutes) {
        double hrAngle = (hour % 12) * 30 + minutes * 0.5;
        //  in one minute hour angle move 0.5 degree
        double minAngle = minutes * 6;
        double diff  = Math.abs(hrAngle - minAngle);
        // starting point of angle is any one point

        return Math.min(diff,360-diff);// there is two angles from l->r , r->l
        // return min angle
    }
}
