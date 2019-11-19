/*
 * Copyright (c) 2019 AcadiaSoft, Inc.
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

package com.acadiasoft.im.base.model.amount;

import com.acadiasoft.im.base.fx.FxRate;

import java.math.BigDecimal;

public interface CurrencyAmount {

  /**
   *
   * @return the string representing the amount
   */
  String getAmountAsString();

  /**
   *
   * @return the currency that the value is associated with
   *  this currency should be a standard three character currency code
   */
  String getAmountCurrency();

  /**
   *
   * @return the string representing the amount in usd or null if not set
   */
  String getAmountUsdAsString();

  // ------------------- default methods ---------------------------------

  String AMOUNT_UNSET = "The amount was null or empty when it was required.";
  String CURRENCY_UNSET = "The currency was either null or not a three character code as was required.";

  default BigDecimal getAmountUsd(FxRate fx) {
    if (getAmountUsdAsString() == null || getAmountUsdAsString().isEmpty()) {
      return fx.convert(this.getAmount(), getAmountCurrency(), FxRate.USD).stripTrailingZeros();
    } else {
      return new BigDecimal(getAmountUsdAsString()).stripTrailingZeros();
    }
  }

  default BigDecimal getAmount() {
    return new BigDecimal(getAmountAsString()).stripTrailingZeros();
  }

  default void checkCurrencyAmount(String amount, String currency) {
    if (amount == null || amount.isEmpty()) {
      throw new IllegalStateException(AMOUNT_UNSET);
    } else if (currency == null || currency.length() != 3) {
      throw new IllegalStateException(CURRENCY_UNSET);
    }
  }

}
