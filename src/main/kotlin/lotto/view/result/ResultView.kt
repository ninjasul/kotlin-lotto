package lotto.view.result

import lotto.domain.LottoPurchaseCount
import lotto.domain.LottoTicket

interface ResultView {
    fun showPurchaseCount(purchaseCount: LottoPurchaseCount)
    fun showLottoTicketNumber(lottoTicket: LottoTicket)
}
