package service;

public interface BankService {

	/**
	 * 客户手机号验证码查询
	 * 
	 * @param param
	 * @return
	 */
	public String mobileVerificationCodeQuery(String param);

	/**
	 * 帐户绑定
	 * 
	 * @param param
	 * @return
	 */
	public String accountBinding(String param);

	/**
	 * 账号解绑
	 * 
	 * @param parsm
	 * @return
	 */
	public String accountUnbundling(String param);

	/**
	 * 银行缴款
	 * 
	 * @param param
	 * @return
	 */
	public String bankPayment(String param);

	/**
	 * 银行缴款结果查询
	 * 
	 * @param param
	 * @return
	 */
	public String queryBankPayment(String param);
	
	/**
	 * 对账 
	 * @param param
	 * @return
	 */
	public String statement(String param);

}
