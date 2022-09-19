/*
 * Copyright (c) 2022 Acadia, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.acadiasoft.im.simmple;

import com.acadiasoft.im.simm.config.HoldingPeriod;
import com.acadiasoft.im.simm.config.SimmCalculationType;
import com.acadiasoft.im.simm.util.AssertUtils;
import com.acadiasoft.im.simmple.config.ImRole;
import com.acadiasoft.im.simmple.config.SimmpleConfig;
import com.acadiasoft.im.simmple.engine.Simmple;
import com.acadiasoft.im.simmple.model.Crif;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * Generated by SimmDayGeneratorTest.printUnitTestsForSimmOptionalOneDayTest
 * 
 * @author joe.peterson
 *
 */
public class SimmOptionalOneDayTest implements SimmOptionalCrifMixin {

  /**
   * Required Passes: None Element Tested: IR Risk Weight with each sensitivity having a unique applicable regulation
   * Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ1() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_47, JS_IR_48);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ1", "Rates & Fx", "Delta", "IR Risk Weight with each sensitivity having a unique applicable regulation", "JS_IR_47,JS_IR_48", "None",
        "Total", " 32,000,000 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("32000000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with one sensitivity having multiple applicable regulations
   * Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ2() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_49, JS_IR_50, JS_IR_51);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ2", "Rates & Fx", "Delta", "IR Risk Weight with one sensitivity having multiple applicable regulations", "JS_IR_49,JS_IR_50,JS_IR_51",
        "None", "Total", " 2,110,553 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("2110553"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with one sensitivity having multiple applicable regulations
   * Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ3() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_49, JS_IR_50, JS_IR_52);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ3", "Rates & Fx", "Delta", "IR Risk Weight with one sensitivity having multiple applicable regulations", "JS_IR_49,JS_IR_50,JS_IR_52",
        "None", "Total", " 5,100,000 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("5100000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with a product specific AddOn applicable under one regulation
   * Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ4() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_53, JS_IR_54, JS_AN_9, JS_AN_10);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ4", "Rates & Fx", "Delta", "IR Risk Weight with a product specific AddOn applicable under one regulation",
        "JS_IR_53,JS_IR_54,JS_AN_9,JS_AN_10", "None", "Total", " 20,400,000 ", " -   ", " -   ", " -   ", " 10,000,000 ", new BigDecimal("30400000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with one sensitivity having no applicable regulation Risk
   * Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ5() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_49, JS_IR_50, JS_IR_55);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ5", "Rates & Fx", "Delta", "IR Risk Weight with one sensitivity having no applicable regulation", "JS_IR_49,JS_IR_50,JS_IR_55", "None",
        "Total", " 2,700,000 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("2700000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with two applicable regulations and a product class multiplier
   * applicable under one regulation Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ6() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_53, JS_IR_56, JS_MUL_5);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ6", "Rates & Fx", "Delta",
        "IR Risk Weight with two applicable regulations and a product class multiplier applicable under one regulation", "JS_IR_53,JS_IR_56,JS_MUL_5", "None", "Total",
        " 17,000,000 ", " -   ", " -   ", " -   ", " 8,500,000 ", new BigDecimal("25500000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with three applicable regulations and two product class
   * multipliers applicable under different regulations Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ7() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_53, JS_IR_56, JS_IR_57, JS_MUL_5, JS_MUL_6);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ7", "Rates & Fx", "Delta",
        "IR Risk Weight with three applicable regulations and two product class multipliers applicable under different regulations", "JS_IR_53,JS_IR_56,JS_IR_57,JS_MUL_5,JS_MUL_6",
        "None", "Total", " 17,000,000 ", " -   ", " -   ", " -   ", " 8,500,000 ", new BigDecimal("25500000"), amount);
  }

  /**
   * Required Passes: J6-J7 Element Tested: IR Risk Weight with three applicable regulations and two product class
   * multipliers applicable under different regulations Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ8() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_53, JS_IR_56, JS_IR_58, JS_MUL_5, JS_MUL_7);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ8", "Rates & Fx", "Delta",
        "IR Risk Weight with three applicable regulations and two product class multipliers applicable under different regulations", "JS_IR_53,JS_IR_56,JS_IR_58,JS_MUL_5,JS_MUL_7",
        "J6-J7", "Total", " 23,200,000 ", " -   ", " -   ", " -   ", " 4,640,000 ", new BigDecimal("27840000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with two applicable regulations across product classes Risk
   * Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ9() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_59, JS_IR_60, JS_IR_61);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ9", "Rates & Fx", "Delta", "IR Risk Weight with two applicable regulations across product classes", "JS_IR_59,JS_IR_60,JS_IR_61", "None",
        "Total", " 56,200,000 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("56200000"), amount);
  }

  /**
   * Required Passes: J9 Element Tested: "IR Risk Weight with two applicable regulations across product classes, with
   * product class multipliers" Risk Measure: Delta Group: Rates & Fx
   */
  @Test
  public void testJ10() {
    List<Crif> sensitivities = Arrays.asList(JS_IR_62, JS_IR_63, JS_MUL_8, JS_MUL_9);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJ10", "Rates & Fx", "Delta", "IR Risk Weight with two applicable regulations across product classes, with product class multipliers",
        "JS_IR_62,JS_IR_63,JS_MUL_8,JS_MUL_9", "J9", "Total", " 56,200,000 ", " -   ", " -   ", " -   ", " 43,500,000 ", new BigDecimal("99700000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with sensitivity subject to SEC rules Risk Measure: Delta
   * Group: Rates & Fx
   */
  @Test
  public void testJS1Segregated() {
    List<Crif> sensitivities = Arrays.asList(SS_IR_64, SS_IR_65, SS_IR_66);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.SEGREGATED).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJS1Segregated", "Rates & Fx", "Delta", "IR Risk Weight with sensitivity subject to SEC rules", "SS_IR_64,SS_IR_65,SS_IR_66", "None",
        "Segregated", " 29,000,000 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("29000000"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with sensitivity subject to SEC rules Risk Measure: Delta
   * Group: Rates & Fx
   */
  @Test
  public void testJS1Unsegregated() {
    List<Crif> sensitivities = Arrays.asList(SS_IR_64, SS_IR_65, SS_IR_66);
    SimmpleConfig config = SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED)
        .simmCalculationType(SimmCalculationType.UNSEGREGATED).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJS1Unsegregated", "Rates & Fx", "Delta", "IR Risk Weight with sensitivity subject to SEC rules", "SS_IR_64,SS_IR_65,SS_IR_66", "None",
        "Unsegregated", " 72,496,179 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("72496179"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with sensitivity subject to SEC rules Risk Measure: Delta
   * Group: Rates & Fx
   */
  @Test
  public void testJS1() {
    List<Crif> sensitivities = Arrays.asList(SS_IR_64, SS_IR_65, SS_IR_66);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJS1", "Rates & Fx", "Delta", "IR Risk Weight with sensitivity subject to SEC rules", "SS_IR_64,SS_IR_65,SS_IR_66", "None", "Total",
        " 72,496,179 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("72496179"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with sensitivity subject to SEC rules Risk Measure: Delta
   * Group: Rates & Fx
   */
  @Test
  public void testJS2Segregated() {
    List<Crif> sensitivities = Arrays.asList(SS_IR_66, SS_IR_67, SS_IR_68);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.SEGREGATED).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJS2Segregated", "Rates & Fx", "Delta", "IR Risk Weight with sensitivity subject to SEC rules", "SS_IR_66,SS_IR_67,SS_IR_68", "None",
        "Segregated", " 61,098,556 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("61098556"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with sensitivity subject to SEC rules Risk Measure: Delta
   * Group: Rates & Fx
   */
  @Test
  public void testJS2Unsegregated() {
    List<Crif> sensitivities = Arrays.asList(SS_IR_66, SS_IR_67, SS_IR_68);
    SimmpleConfig config = SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED)
        .simmCalculationType(SimmCalculationType.UNSEGREGATED).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJS2Unsegregated", "Rates & Fx", "Delta", "IR Risk Weight with sensitivity subject to SEC rules", "SS_IR_66,SS_IR_67,SS_IR_68", "None",
        "Unsegregated", " 34,054,310 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("34054310"), amount);
  }

  /**
   * Required Passes: None Element Tested: IR Risk Weight with sensitivity subject to SEC rules Risk Measure: Delta
   * Group: Rates & Fx
   */
  @Test
  public void testJS2() {
    List<Crif> sensitivities = Arrays.asList(SS_IR_66, SS_IR_67, SS_IR_68);
    SimmpleConfig config =
        SimmpleConfig.Builder().calculationCurrency("USD").holdingPeriod(HoldingPeriod.ONE_DAY).imRole(ImRole.SECURED).simmCalculationType(SimmCalculationType.TOTAL).build();
    BigDecimal amount = Simmple.calculateWorstOf(sensitivities, config).getImTree().getMargin();
    AssertUtils.assertEquals(false, "testJS2", "Rates & Fx", "Delta", "IR Risk Weight with sensitivity subject to SEC rules", "SS_IR_66,SS_IR_67,SS_IR_68", "None", "Total",
        " 61,098,556 ", " -   ", " -   ", " -   ", " -   ", new BigDecimal("61098556"), amount);
  }
}
