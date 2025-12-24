package com.tcs.RCS.service.impl;

import com.tcs.RCS.pojo.EmpLog;
import com.tcs.RCS.service.EmpLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class EmpLogServiceImpl implements EmpLogService {

  @Transactional(propagation = Propagation.REQUIRES_NEW)
  @Override
  public void insertlog(EmpLog log) {
    EmpLogServiceImpl.log.info("Insert Mock");
  }
}
