package com.jjblancodev.jobportal.mappers.company;

import com.jjblancodev.jobportal.dto.CompanyDto;
import com.jjblancodev.jobportal.dto.JobDto;
import com.jjblancodev.jobportal.entity.Company;
import com.jjblancodev.jobportal.mappers.job.JobMapper;

import java.util.List;

public class CompanyMapper {
    public static CompanyDto transformCompanyToDto(Company company) {
        List<JobDto> jobDtoList = company.getJobs().stream().map(JobMapper::transformJobToDto).toList();

        return new CompanyDto(
                company.getId(), company.getName(), company.getLogo(), company.getIndustry(), company.getSize(),
                company.getRating(), company.getLocations(), company.getFounded(), company.getDescription(),
                company.getEmployees(), company.getWebsite(), company.getCreatedAt(), jobDtoList
        );
    }
}
