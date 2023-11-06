package lotto.service;


import lotto.Lotto;
import lotto.domain.UserLotto;
import lotto.dto.response.LottoCollection;
import lotto.dto.response.LottoNumber;

public class LottoService implements Calculation{

	UserLotto userLotto = new UserLotto();

	@Override
	public LottoCollection createLotto(String price) {
		userLotto.setLotto(price);
		LottoCollection lottoCollection = new LottoCollection();
		lottoCollection.setLottoCount(userLotto.getLottoCount());
		for(Lotto lotto : userLotto.getAllLotto()){
			LottoNumber lottoNumber = new LottoNumber(lotto.getNumbers());
			lottoCollection.addLottoCollection(lottoNumber);
		}
		return lottoCollection;
	}
}