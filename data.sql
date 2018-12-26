INSERT INTO td_month_master(id,sunday,monday,tuesday,wednesday,thursday,friday,saturday
  ,sunday_month_lunar,monday_month_lunar,tuesday_month_lunar,wednesday_month_lunar,thursday_month_lunar,friday_month_lunar,saturday_month_lunar
  ,sunday_day_lum_lunar,monday_day_lum_lunar,tuesday_day_lum_lunar,wednesday_day_lum_lunar,thursday_day_lum_lunar,friday_day_lum_lunar,saturday_day_lum_lunar
  ,sunday_event,monday_event,tuesday_event,wednesday_event,thursday_event,friday_event,saturday_event
  ,sunday_holiday,monday_holiday,tuesday_holiday,wednesday_holiday,thursday_holiday,friday_holiday,saturday_holiday
  ,sunday_moon_number,monday_moon_number,tuesday_moon_number,wednesday_moon_number,thursday_moon_number,friday_moon_number,saturday_moon_number
  ,footer_holiday1,footer_holiday2,footer_holiday3,footer_holiday4,footer_holiday5
  ,month,year,year_lunar,year_buddha_era,month_en,year_en,num_month_en
  ,moon_num_each_sunday,moon_num_each_monday,moon_num_each_tuesday,moon_num_each_wednesday,moon_num_each_thursday,moon_num_each_friday,moon_num_each_saturday
)
VALUES (1,'6','','1','2','3','4','5'
  ,'មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ'
  ,'6',    '',   '1',   '2',  '3',  '4' ,'5'
  ,'',    '',   '',      '',    '',   '', ''
  ,'',    '',   'ចូលឆ្នាំសកល','','','',''
  ,'កើត','កើត','កើត','កើត','កើត','កើត','កើត'
  ,'',    '',   '',      '',    ''
  ,'មករា','២០១៩','ច','២៥៦២','January','2019',1
  ,'១','','១០','១១','១២','១៣','១៤'
),
  (2,'13','7','8','9','10','11','12'
  ,'មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ','មិគសិរ'
  ,'13',    '7',   '8',   '9',  '10',  '11' ,'12'
  ,'',    'ទិវាជ័យជំនះ',   '',      '',    '',   '', ''
  ,'',    '',   'ចូលឆ្នាំសកល','','','',''
  ,'កើត','កើត','កើត','កើត','កើត','កើត','កើត'
  ,'',    '',   '',      '',    ''
  ,'មករា','២០១៩','ច','២៥៦២','January','2019',1
  ,'៨','២','៣','៤','៥','៦','៧'
);

SELECT *FROM td_month_master;

DELETE FROM td_month_master WHERE id = 1;

INSERT INTO td_data_month_master(id,monday_solar_num,tuesday_solar_num,wednesday_solar_num,thursday_midpright_co,friday_solar_num,saturday_solar_num,sunday_solar_num
,monday_midpright_co,tuesday_midpright_co,wednesday_midpright_co,thursday_midpright_co,friday_midpright_co,saturday_midpright_co,sunday_midpright_co
,monday_top_url,tuesday_top_url,wednesday_top_url,thursday_top_url,friday_top_url,saturday_top_url,sunday_top_url
,monday_topright_co,tuesday_topright_co,wednesday_topright_co,thursday_topright_co,friday_topright_co,saturday_topright_co,sunday_topright_co
,monday_underpright_co,tuesday_underpright_co,wednesday_underpright_co,thursday_underpright_co,friday_underpright_co,saturday_underpright_co,sunday_underpright_co
,month,num_month,year,year_en,year_lunar,year_buddha_era
) VALUES (1,'','1','2','3','4','5','6'
,'','10 រោច','១១ រោចខែមិគសិរ','១២ រោច','១៣ រោច ថ្ងៃកោរ','១៤ រោចខែដាច់','១ កើត ខែបុស្ស'
,'','','','','','url',''
,'','','','','','',''
,'','ចូលឆ្នាំសកល','','','','',''
,'មករា','01','២០១៩','2019','ច','២៥៦២'
)
;