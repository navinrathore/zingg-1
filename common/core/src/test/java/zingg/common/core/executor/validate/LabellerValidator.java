package zingg.common.core.executor.validate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import zingg.common.client.ZFrame;
import zingg.common.client.ZinggClientException;
import zingg.common.client.util.ColName;
import zingg.common.core.executor.Labeller;

public class LabellerValidator<S, D, R, C, T> extends ExecutorValidator<S, D, R, C, T> {

	public static final Log LOG = LogFactory.getLog(LabellerValidator.class);
	
	public LabellerValidator(Labeller<S, D, R, C, T> executor) {
		super(executor);
	}

	@Override
	public void validateResults() throws ZinggClientException {
		// check that marked data has at least 1 match row and 1 unmatch row
		ZFrame<D, R, C> dfMarked = executor.getContext().getPipeUtil().
				read(false, false, executor.getContext().getModelHelper().getTrainingDataMarkedPipe(executor.getArgs()));
		
		C matchCond = dfMarked.equalTo(ColName.MATCH_FLAG_COL, 1);
		C notMatchCond = dfMarked.equalTo(ColName.MATCH_FLAG_COL, 0);
		
		long matchCount = dfMarked.filter(matchCond).count();
		assertTrue(matchCount > 1);
		long unmatchCount = dfMarked.filter(notMatchCond).count();
		assertTrue(unmatchCount > 1);
		LOG.info("matchCount : "+ matchCount + ", unmatchCount : " + unmatchCount);		
	}

}
