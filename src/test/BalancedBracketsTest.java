package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlySpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void stringInBetweenBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsInBetweenString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void bracketsBeforeString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void singleBracketLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleBracketRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void backwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void singleBracketWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }
    @Test
    public void backwardsBracketsWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }


}
